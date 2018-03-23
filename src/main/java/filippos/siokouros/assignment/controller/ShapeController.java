package filippos.siokouros.assignment.controller;

import filippos.siokouros.assignment.model.Shape;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {

    @RequestMapping("/drawShape")
    public Shape shape(@RequestParam(value="shape",defaultValue=" " ) String shape,
                          @RequestParam(value="color",defaultValue="0" )String color,
                          @RequestParam(value = "a", defaultValue="0" ) String a,
                          @RequestParam(value = "b", defaultValue="0")String b,
                          Model model) {
        model.addAttribute("shape",shape);
        model.addAttribute("color",color);
        String text = "Let's draw a " + shape.substring(0, 1).toUpperCase() + shape.substring(1) + " with " + color + " color";
        model.addAttribute("text" ,text);
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        return new Shape(a,b,shape,color);
    }
}
