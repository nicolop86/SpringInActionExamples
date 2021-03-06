package sia.chapter3.ambiguity.tree;

import org.springframework.stereotype.Component;

import sia.chapter3.ambiguity.myQualifiers.MapleQualifier;
import sia.chapter3.ambiguity.myQualifiers.TreeWithLeaves;

@Component
@MapleQualifier
@TreeWithLeaves
public class Maple implements Tree {

	@Override
	public void showLeaves() {
		System.out.println("Showing maple leaves!");
	}

}
