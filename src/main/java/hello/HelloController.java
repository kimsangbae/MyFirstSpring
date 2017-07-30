package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class HelloController {

    @RequestMapping
    public String index() {
        return "Hello World\r\n";
    }

    @RequestMapping("/{var}")
    public String requestMapping(@PathVariable String var) {

        HelloController helloController = new HelloController();

        if(isNumeric(var)) {
            return helloController.gugudanShow(var);
        }
        else {
            return helloController.helloPrint(var);
        }
    }

    public String gugudanShow(String var1) {

        StringBuffer sb = new StringBuffer();

        for(int i = 1; i <= 9; i++) {
            sb.append(var1 + " * " + i + " = " + i * Integer.parseInt(var1) + "\r\n");
        }

        return sb.toString();
    }

    public String helloPrint(String var2) {

        return "Hello\r\n";
    }

    public static boolean isNumeric(String s)
    {
        return s.matches("-?\\d+(\\.\\d+)?");
    }

}
