package sia.chapter3.ambiguity.tree;

import org.springframework.stereotype.Component;

import sia.chapter3.ambiguity.myQualifiers.OakQualifier;

@Component
@OakQualifier
public class Oak implements Tree {

	@Override
	public void showLeaves() {
		System.out.println("Showing oak leaves!");
	}

}
