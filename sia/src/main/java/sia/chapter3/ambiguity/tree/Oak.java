package sia.chapter3.ambiguity.tree;

import org.springframework.stereotype.Component;

import sia.chapter3.ambiguity.myQualifiers.OakQualifier;
import sia.chapter3.ambiguity.myQualifiers.TreeWithAcorns;

@Component
@OakQualifier
@TreeWithAcorns
public class Oak implements Tree {

	@Override
	public void showLeaves() {
		System.out.println("Showing oak leaves!");
	}

}
