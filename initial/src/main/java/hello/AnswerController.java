package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eyoeyag on 4/9/2018.
 */

@RestController
public class AnswerController {

    @RequestMapping("/why")
    public String why() {
        return "why";
    }
}
