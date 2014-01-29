package eu.fittest.fbk.efsm2ct.log2efsm.common;

// typical instance
//
// instance type:AppAbstractState
// attr:catalogContents
// type:Array
// value:eu.fittest.modelInference.logConverter.model.Instance@6345e044
// attr:cartTotal
// type:String
// value:"$0.00"
// attr:numInShopCart
// type:int
// value:0
// attr:compareCartContents
// type:Array
// value:eu.fittest.modelInference.logConverter.model.Instance@86c347
// attr:shoppingCartContents
// type:Array
// value:eu.fittest.modelInference.logConverter.model.Instance@f7e6a96
// attr:numInCompareCart
// type:int
// value:0
// attr:numOfSelectedItems
// type:int
// value:6
// attr:I
// type:ID
// value:2

/**
 * hard-coded rules for Flexstore application - TODO substitute with a Ruleset
 * parsed from an XML file
 * 
 * @author tiella
 * 
 */

public class FlexstoreV3StateMappingRuleset extends StateMappingRuleset {

	public FlexstoreV3StateMappingRuleset() {

		super();
		
/*
        // From samples/flexstoreCaseStudy/iteration2/flexstore3/logger/src/MySerializationDelegates.as
         
        s.beginObject(app,"AppAbstractState") ;
        s.storeField(new QName("numOfSelectedItems"), numOfSelectedItems) ;
        s.storeField(new QName("numInShopCart"), numInShopCart) ;
        s.storeField(new QName("numInCompareCart"), numInCompareCart) ;
        s.storeField(new QName("cartCurrency"), cartCurrency) ;
        s.storeField(new QName("cartTotal"), cartTotal) ;
        s.storeField(new QName("selectedProduct"), selectedProduct) ;
        s.storeField(new QName("catalogContents"), catalogContents);
        s.storeField(new QName("shoppingCartContents"), shoppingCartContents);
        s.storeField(new QName("compareCartContents"), compareCartContents);
        s.endObject() ;
 */
		
		{

			StateMappingRule rule = new StateMappingRule();

			rule.setAttrNameRegex("num.*");
			rule.setInType("int");
			rule.setInPred("Integer.parseInt(v) > 0");
			rule.setOutType("int");
			rule.setOutSymbol("GreaterThanZero");
			rule.setOutPredFmt("$1 > 0");

			addRule(rule);

		}

		{

			StateMappingRule rule = new StateMappingRule();

			rule.setAttrNameRegex("num.*");
			rule.setInType("int");
			rule.setInPred("Integer.parseInt(v) == 0");
			rule.setOutType("int");
			rule.setOutSymbol("Zero");
			rule.setOutPredFmt("$1 == 0");

			addRule(rule);

		}
		
		
		{

			StateMappingRule rule = new StateMappingRule();

			rule.setAttrNameRegex("num.*");
			rule.setInType("int");
			rule.setInPred("Integer.parseInt(v) < 0");
			rule.setOutType("int");
			rule.setOutSymbol("LessThanZero");
			rule.setOutPredFmt("$1 < 0");

			addRule(rule);

		}
		
		/* take into consideration selectedProduct */
		
		{

			StateMappingRule rule = new StateMappingRule();

			rule.setAttrNameRegex("selectedProduct");
			rule.setInType("int");
			rule.setInPred("Integer.parseInt(v) < 0");
			rule.setOutType("int");
			rule.setOutSymbol("Empty");
			rule.setOutPredFmt("$1 < 0");

			addRule(rule);

		}
		
		{

			StateMappingRule rule = new StateMappingRule();

			rule.setAttrNameRegex("selectedProduct");
			rule.setInType("int");
			rule.setInPred("Integer.parseInt(v) >= 0");
			rule.setOutType("int");
			rule.setOutSymbol("NotEmpty");
			rule.setOutPredFmt("$1 >= 0");

			addRule(rule);

		}
		
		
	

	}

}
