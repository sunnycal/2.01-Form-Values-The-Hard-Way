    package com.example.demo;

    //the import calling the Java library
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestParam;

        @Controller
        public class HomeController {
        @RequestMapping("/loadform")
        public String loadFormPage(){
            return "formtemplate";
        }

        @RequestMapping("/processform")
        //class and object of the class (Model & model is object)
        public String loadFormPage (@RequestParam("login") String login,
        Model model){
                    model.addAttribute("loginval", login);
            return "confirm";

        }
}


