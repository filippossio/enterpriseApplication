package filippos.siokouros.assignment.controller;

import filippos.siokouros.assignment.model.Question;
import filippos.siokouros.assignment.model.Shape;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class QuestionController {

    @RequestMapping("/question")
    public Question question(@RequestParam(value="shape",defaultValue=" " ) String shape, Model model) {

        model.addAttribute("shape",shape);
       if(shape.equals("Square")){
           return new Question("What is the perimeter of the Square?");
       }else if(shape.equals("Triangle")){
           return new Question("What is the area of the Triangle?");
       }else if(shape.equals("Ellipse")){
           return new Question("What is the area of the Ellipse");
       }else if(shape.equals("Circle")){
           return new Question("What is the area of the Circle");
       }else if(shape.equals( "Line")){
           return new Question("What is the length of the Line?");
       }else if(shape.equals("Point")){
           return new Question("What is the area of the Point?");
       }else return new Question("");
    }
}
