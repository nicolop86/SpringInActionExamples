package sia.chapter3.ambiguity.park;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sia.chapter3.ambiguity.tree.Tree;

@Component
public class AmericanPark implements Park {

	private Tree tree;

	@Autowired
	public AmericanPark (Tree tree){
		this.tree = tree;
	}
	
	@Override
	public void showingTrees() {
		this.tree.showLeaves();
		System.out.println("In USA");
	}

}
