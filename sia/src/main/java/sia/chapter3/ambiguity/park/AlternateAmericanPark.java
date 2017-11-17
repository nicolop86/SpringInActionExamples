package sia.chapter3.ambiguity.park;

import org.springframework.beans.factory.annotation.Autowired;

import sia.chapter3.ambiguity.myQualifiers.OakQualifier;
import sia.chapter3.ambiguity.myQualifiers.TreeWithAcorns;
import sia.chapter3.ambiguity.tree.Tree;

public class AlternateAmericanPark implements Park {

	private Tree tree;
	
	@Autowired
	@TreeWithAcorns
	@OakQualifier
	public void setTree(Tree t){
		this.tree = t;
	}

	@Override
	public void showingTrees() {
		this.tree.showLeaves();
		System.out.println("In USA");
		System.out.println("Using 2 qualifiers");
	}
	
}