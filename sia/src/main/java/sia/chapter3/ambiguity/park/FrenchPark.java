package sia.chapter3.ambiguity.park;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sia.chapter3.ambiguity.tree.Tree;

@Component
public class FrenchPark implements Park {

	private Tree tree;

	@Autowired
	public FrenchPark (Tree tree){
		setTree(tree);
	}
	
	@Override
	public void showingTrees() {
		this.tree.showLeaves();
		System.out.println("In France");
	}

	public void setTree(Tree tree){
		this.tree = tree;
	}
	
}
