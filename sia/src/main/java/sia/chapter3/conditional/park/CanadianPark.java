package sia.chapter3.conditional.park;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sia.chapter3.conditional.tree.Tree;

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
	}

}
