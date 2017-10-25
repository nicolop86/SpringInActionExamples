package sia.chapter3.ambiguity.park;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sia.chapter3.ambiguity.tree.Tree;

@Component
public class ItalianPark implements Park {

	private Tree tree;

	@Autowired
	public ItalianPark (Tree tree){
		setTree(tree);
	}
	
	@Override
	public void showingTrees() {
		this.tree.showLeaves();
		System.out.println("In Italy");
	}

	public void setTree(Tree tree){
		this.tree = tree;
	}
	
}