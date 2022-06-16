package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Searchcontroller {
	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home view...");
		return "home";

	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		RedirectView redirectview = new RedirectView();
		
		if (query.isBlank()) {
			redirectview.setUrl("home");
			return redirectview;

		}

		String url = "https://www.google.com/search?q=" + query;
		
		redirectview.setUrl(url);

		return redirectview;

	}

}
