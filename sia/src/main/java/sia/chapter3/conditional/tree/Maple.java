package sia.chapter3.conditional.tree;

import org.springframework.stereotype.Component;

@Component
public class Maple implements Tree {

	@Override
	public void showLeaves() {
		System.out.println("Showing maple leaves");
	}

}
