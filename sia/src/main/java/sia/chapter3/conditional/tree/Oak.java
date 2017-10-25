package sia.chapter3.conditional.tree;

import org.springframework.stereotype.Component;

@Component
public class Oak implements Tree {

	@Override
	public void showLeaves() {
		System.out.println("Showing oak leaves");
	}

}
