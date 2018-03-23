package filippos.siokouros.assignment.controller;

import filippos.siokouros.assignment.model.Answer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

    @RequestMapping("/answer")
    public Answer answer(@RequestParam(value="ans", defaultValue = " ")int ans,
                         @RequestParam(value = "a",defaultValue = " ")int a,
                         @RequestParam(value = "b",defaultValue = " ")int b,
                         @RequestParam(value = "shape", defaultValue = " ")String shape,
                         Model model){

        if(shape.equals("Square")){
            if(a*4 == ans){
                return new Answer(true);
            }else return new Answer(false);
        } else  if(shape.equals("Triangle")){
            if(b*a /2 ==ans){
                return new Answer(true);
            }else return new Answer(false);
        } else  if(shape.equals("Ellipse")){
            if(b*a*Math.PI ==ans){
                return new Answer(true);
            }else return new Answer(false);
        } else  if(shape.equals("Circle")){
            if(Math.PI * Math.pow(a,2) ==ans){
                return new Answer(true);
            }else return new Answer(false);
        } else  if(shape.equals("Line")){
            if(Math.abs(a-b) ==ans){
                return new Answer(true);
            }else return new Answer(false);
        } else  if(shape.equals("Point")){
            if(ans == 1){
                return new Answer(true);
            }else return new Answer(false);
        }else return new Answer(false);
    }
}
