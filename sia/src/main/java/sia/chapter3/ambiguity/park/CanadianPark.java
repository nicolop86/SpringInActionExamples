package sia.chapter3.ambiguity.park;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sia.chapter3.ambiguity.tree.Tree;

@Component
public class CanadianPark implements Park {

	private Tree tree;

	@Autowired
	public CanadianPark (Tree tree){
		this.tree = tree;
	}
	
	@Override
	public void showingTrees() {
		this.tree.showLeaves();
		System.out.println("In Canada");
	}
	
}
