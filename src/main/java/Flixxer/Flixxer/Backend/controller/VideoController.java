package Flixxer.Flixxer.Backend.controller;
import Flixxer.Flixxer.Backend.models.Video;
import Flixxer.Flixxer.Backend.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class VideoController {

    @GetMapping(value = "/w")
    public String getPage(){
        return "Hello World";
    }


    @Autowired
    private VideoRepository videoRepository;

    @GetMapping(value = "/videos")
    public List<Video> getVideos() {
        return videoRepository.findAll();
    }

    @PostMapping(value ="/save")
    public String saveVideo(@RequestBody Video video) {
        videoRepository.save(video);
        return "Video saved";
    }

    @PutMapping(value = "update/{content_id}")
    public String updateVideo(@PathVariable long content_id, @RequestBody Video video) {
        Video updatedVideo = videoRepository.findById(content_id).get();
        updatedVideo.setDescription(video.getDescription());
        updatedVideo.setTitle(video.getTitle());
        updatedVideo.setGenre(video.getGenre());
        updatedVideo.setDuration(video.getDuration());
        updatedVideo.setRating(video.getRating());
        updatedVideo.setReleaseDate(video.getReleaseDate());
        videoRepository.save(updatedVideo);
        return "Video updated";
    }

    @DeleteMapping(value = "/delete/{content_id}" )
    public String deleteVideo(@PathVariable long content_id) {
        Video deleteVideo = videoRepository.findById(content_id).get();
        videoRepository.delete(deleteVideo);
        return "Video deleted";
    }

}
