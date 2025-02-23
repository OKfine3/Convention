package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.analysis.Iterator;
import edu.ustb.crypto.convention.compile.entity.Contract;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import edu.ustb.crypto.convention.utils.ParserUtil;
import org.junit.Test;

public class ContractVisitorTest {

    @Test
    public void ctxTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyerContract.spesc");
        SpescParser.ContractDefinitionContext contractDefinitionContext = parser.contractDefinition();
        Contract contract = new ContractVisitor().visitContractDefinition(contractDefinitionContext);
        System.out.println(contract);
    }

    @Test
    public void bindClause() {
        SpescParser parser = ParserUtil.getParser(
                "@@条款1:约束条款\n" +
                        "    bind clause no1:\n" +
                        "        downPayment <= price * 20\n" +
                        "        Goods NOT_IN ProhibitedItems = [Firearms, IllegalDrugs, StolenGoods, HumanOrgans]");
        AttributeTreeNode attributeTreeNode = new ClauseVisitor().visitClause(parser.clause());
        System.out.println(attributeTreeNode);
    }

    @Test
    public void breachClauseTest() {
        SpescParser parser = ParserUtil.getParser(
                "@@违约条款9：如果买受人在支付日期确认收货日期前没有支付应付货款也没有退货，则需要缴纳滞纳金\n" +
                        "    breach clause no9 against clause no4:Buyer must fulfil obligation payLatePayment\n" +
                        "        when after confirmDate\n" +
                        "        while transfer latePaid to Seller");
        AttributeTreeNode attributeTreeNode = new ClauseVisitor().visitClause(parser.clause());
        System.out.println(attributeTreeNode);
    }

    @Test
    public void generalClauseTest(){
        SpescParser parser = ParserUtil.getParser(
                "@@条款4：出卖人须在买方付款后，交付日期之前交付货物\n" +
                        "    clause no4:Seller must fulfil obligation deliverGoods\n" +
                        "\t\twhen before deliverDate and after Buyer did payAdvance\n" +
                        "\t\twhile transfer $goodsRight to Buyer");
        AttributeTreeNode attributeTreeNode = new ClauseVisitor().visitClause(parser.clause());
        System.out.println(attributeTreeNode);
    }

    @Test
    public void conventionTest(){
        SpescParser parser = ParserUtil.getParser(
                "convention SaleAndBuyConvention{\n" +
                        "    party Buyer{\n" +
                        "        account:Integer\n" +
                        "    }\n" +
                        "    party Seller{\n" +
                        "        account:Integer\n" +
                        "    }\n" +
                        "\n" +
                        "    asset Goods{\n" +
                        "        advance:Money\n" +
                        "        deliverDate:Date\n" +
                        "        amount:Integer\n" +
                        "    }\n" +
                        "\n" +
                        "\taddition infos{\n" +
                        "\t\tstartTime:Date\n" +
                        "\t\tpayDate:Date\n" +
                        "\t\tpayAdvanceDate:Date\n" +
                        "\t\tconfirmDate:Date\n" +
                        "\t\treturnDate:Date\n" +
                        "\t\tlatePaid:Money\n" +
                        "\t}\n" +
                        "\n" +
                        "    legalRight of ownershipRight under Art240:\n" +
                        "        Seller possess the right including [possessRight, useRight, usufructRight, desposeRight]\n" +
                        "        on the object including [immoAvableProperty, movableProperty]\n" +
                        "        according to Civil_Code_of_the_Peoples_Republic_of_China\n" +
                        "\n" +
                        "\n" +
                        "    @@条款1:约束条款\n" +
                        "    bind clause no1:\n" +
                        "        downPayment <= price * 20\n" +
                        "        Goods NOT_IN ProhibitedItems = [Firearms, IllegalDrugs, StolenGoods, HumanOrgans]\n" +
                        "\n" +
                        "\t@@条款2：买受人可以开始购买货物\n" +
                        "    clause no2:Buyer can exercise right buyGoods\n" +
                        "\n" +
                        "    @@条款3:买受人必须支付预付款\n" +
                        "\tclause no3:Buyer must fulfil obligation payAdvance\n" +
                        "\t\twhen after Buyer did buyGoods and before payAdvanceDate\n" +
                        "\t\twhile deposit advance\n" +
                        "\n" +
                        "\t@@条款4：出卖人须在买方付款后，交付日期之前交付货物\n" +
                        "    clause no4:Seller must fulfil obligation deliverGoods\n" +
                        "\t\twhen before deliverDate and after Buyer did payAdvance\n" +
                        "\t\twhile transfer $goodsRight to Buyer\n" +
                        "\n" +
                        "    @@条款5：买受人在收到货物后，确认收货日期前，并且未申请退款，需要确认收货并支付余款(when条件有些问题)\n" +
                        "    clause no5:Buyer must fulfil obligation confirmReceiveAndPayBalance\n" +
                        "\t\twhen after Seller did deliverGoods and before confirmDate\n" +
                        "\t\twhile deposit balance\n" +
                        "\n" +
                        "\t@@条款6：买方可以申请退款(私约中缺失)\n" +
                        "\tclause no6:Buyer can exercise right requireRefund\n" +
                        "\t\twhen after Seller did deliverGoods and before confirmDate\n" +
                        "\n" +
                        "\t@@条款7：买方申请退款后，必须在一定时间内退回物品（顺应缺失,是需要与clause no5相关联出现的条款）\n" +
                        "\tclause no7:Buyer must fulfil obligation returnGoods\n" +
                        "\t\twhen after Buyer did requireRefund and before returnDate\n" +
                        "\t\twhile transfer $goodsRight to Seller\n" +
                        "\n" +
                        "\t@@条款8：出卖方在买受方退货后必须退款\n" +
                        "\tclause no8:Seller must fulfil obligation refund\n" +
                        "\t\twhen after Buyer did returnGoods\n" +
                        "\t\twhile transfer advance to Buyer\n" +
                        "\n" +
                        "\t@@违约条款9：如果买受人在支付日期确认收货日期前没有支付应付货款也没有退货，则需要缴纳滞纳金\n" +
                        "    breach clause no9 against clause no4:Buyer must fulfil obligation payLatePayment\n" +
                        "        when after confirmDate\n" +
                        "        while transfer latePaid to Seller\n" +
                        "\n" +
                        "    implement declaration{\n" +
                        "       Enacting Agency:Beijing,\n" +
                        "       Enactment Date:2024-01-01 00:00:00,\n" +
                        "       Implementation Date:2024-01-02  00:00:00\n" +
                        "    }\n" +
                        "}\n" +
                        "\n");
        SpescParser.ContractDefinitionContext conventionDefinitionContext = parser.contractDefinition();
        Contract convention = new ContractVisitor().visitContractDefinition(conventionDefinitionContext);
        System.out.println(convention);

    }

    @Test
    public void contractTest() {
        SpescParser parser = ParserUtil.getParser(
                "contract sale constraint_by SaleAndBuyConvention{\n" +
                        "\t\tparty Seller{\n" +
                        "\t\t\t\taccount:100\n" +
                        "\t\t}\n" +
                        "\t\tparty Buyer{\n" +
                        "\t\t\t\taccount : 101\n" +
                        "\t\t}\n" +
                        "\n" +
                        "        asset Meat{\n" +
                        "\t\t\tquantity:Integer\n" +
                        "\t\t\tprice:Money\n" +
                        "\t\t}isFirearms=false,isIllegalDrugs=false,isHumanOrgans=false\n" +
                        "\n" +
                        "\n" +
                        "\t\taddition infos{\n" +
                        "\t\t\tstartTime:Date\n" +
                        "\t\t\tpayDate:Date\n" +
                        "\t\t\tconfirmDate:Date\n" +
                        "\t\t\treturnDate:Date\n" +
                        "\t\t\tlatePaid:Money\n" +
                        "\t\t\tdelieverDate:Date\n" +
                        "\t\t\tdelieverDuration:Date\n" +
                        "\t\t}\n" +
                        "\n" +
                        "\t\t@@买方可以购买货物\n" +
                        "\t\tterm no1:Buyer can buyMeat\n" +
                        "\t\t\twhere startTime = now and payDate = now + payDuration\n" +
                        "\n" +
                        "\t\t@@买方应当于支付日期前向卖方支付定金（downPayment=price * payRate）\n" +
                        "\t\tterm no2:Buyer must payDownpaymen\n" +
                        "\t\t\twhen after Buyer did buyMeat and before payDate\n" +
                        "\t\t\twhile transfer price * payRate to Seller\n" +
                        "\t\t\twhere delieverDate = now + delieverDuration\n" +
                        "\n" +
                        "\t\t@@卖方必须交付货物(缺失公约中的一个when条件)\n" +
                        "\t\tterm no3:Seller must deliverMeat\n" +
                        "\t\t\twhile transfer $meatRight to Buyer\n" +
                        "\n" +
                        "\t\t@@买方必须在卖方交付货物后十天内支付余款\n" +
                        "\t\tterm no4:Buyer must payBalance\n" +
                        "\t\t\twhen within 10 day after Seller did deliverMeat\n" +
                        "\t\t\twhile transfer (1-payRate) * price to Seller\n" +
                        "\n" +
                        "\n" +
                        "\t\tsignature of party Buyer:\n" +
                        "\t\t{\t\tprintedName: String,\n" +
                        "\t\t\t\tsignature: String,\n" +
                        "\t\t\t\tdate: Date\n" +
                        "\t\t}\n" +
                        "\t\tsignature of party Seller:\n" +
                        "\t\t{\t\tprintedName: String,\n" +
                        "\t\t\t\tsignature: String,\n" +
                        "\t\t\t\tdate: Date\n" +
                        "\t\t}\n" +
                        "}");
        SpescParser.ContractDefinitionContext contractDefinitionContext = parser.contractDefinition();
        Contract contract = new ContractVisitor().visitContractDefinition(contractDefinitionContext);
        System.out.println(contract);
    }

}
