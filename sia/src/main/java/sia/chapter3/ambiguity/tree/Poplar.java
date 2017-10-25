package sia.chapter3.ambiguity.tree;

import org.springframework.stereotype.Component;

@Component
public class Poplar implements Tree {

	@Override
	public void showLeaves() {
		System.out.println("Showing poplar leaves");
	}

}