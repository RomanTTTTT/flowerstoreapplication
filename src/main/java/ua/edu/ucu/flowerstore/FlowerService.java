package ua.edu.ucu.flowerstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class FlowerService {
    public List<Flower> getFlowers() {
        return List.of(new Flower(0, 0, null, null));
    }
}
