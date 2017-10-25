package sia.chapter3.ambiguity.park;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import sia.chapter3.ambiguity.tree.Tree;

@Component
public class FrenchPark implements Park {

	@Autowired
	@Qualifier("pineTree")
	private Tree tree;

	public void setTree(Tree tree){
		this.tree = tree;
	}
	
	@Override
	public void showingTrees() {
		this.tree.showLeaves();
		System.out.println("In France");
	}
	
}
