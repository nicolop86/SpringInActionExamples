package sia.chapter3.ambiguity.park;

import org.springframework.beans.factory.annotation.Autowired;

import sia.chapter3.ambiguity.myQualifiers.MapleQualifier;
import sia.chapter3.ambiguity.myQualifiers.TreeWithLeaves;
import sia.chapter3.ambiguity.tree.Tree;

public class AlternateCanadianPark implements Park {

	private Tree tree;
	
	@Autowired
	@TreeWithLeaves
	@MapleQualifier
	public void setTree(Tree t){
		this.tree = t;
	}

	@Override
	public void showingTrees() {
		this.tree.showLeaves();
		System.out.println("In Canada");
		System.out.println("Using 2 qualifiers");
	}

}
