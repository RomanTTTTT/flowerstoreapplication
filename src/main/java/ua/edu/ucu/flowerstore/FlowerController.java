package ua.edu.ucu.flowerstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping
public class FlowerController {
    private final FlowerService service;
    @Autowired
    public FlowerController(FlowerService service) {
        this.service = service;
    }
    @GetMapping
	public List<Flower> getFlowers() {
        return service.getFlowers();
    }
}
