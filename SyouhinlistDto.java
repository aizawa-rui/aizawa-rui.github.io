package work;

import java.sql.Timestamp;

/**----------------------------------------------------------------------*
 *■■■SurveyDtoクラス■■■
 *概要：DTO（「survey」テーブル）
 *----------------------------------------------------------------------**/
public class  SyouhinlistDto {

	//----------------------------------------------------------------
	//フィールド
	//----------------------------------------------------------------
	private int         goods11;                //名前
	private int         field11;                 //年齢
	private int         goods21 ;                 //性別
	private int         field21 ;   //満足度
	private int         goods31;             //メッセージ
	private int         field31; 
	private int         field_total11;
	private int         field_tax1;
	private int         field_total21;//更新時刻
	private Timestamp   time ; 

	//----------------------------------------------------------------
	//getter/setter
	//----------------------------------------------------------------

	//getter/setter（対象フィールド：name）
	
	
	public int getGoods1() { return goods11; }
	public void setGoods1(int goods11) { this.goods11 = goods11; }

	//getter/setter（対象フィールド：age）
	public int getField1() { return field11; }
	public void setField1(int field11) { this.field11 = field11; }

	//getter/setter（対象フィールド：sex）
	public int getGoods2() { return goods21; }
	public void setGoods2(int goods21) { this.goods21 = goods21; }

	//getter/setter（対象フィールド：age）
	public int getField2() { return field21; }
	public void setField2(int field21) { this.field21 = field21; }

	//getter/setter（対象フィールド：message）
	public int getGoods3() { return goods31; }
	public void setGoods3(int goods31) { this.goods31 = goods31; }

	//getter/setter（対象フィールド：age）
	public int getField3() { return field31; }
	public void setField3(int field31) { this.field31 = field31; }
	
	public int getField_Total1() { return field_total11; }
	public void setField_Total1(int field_total11) { this.field_total11 = field_total11; }
	
	public int getField_Tax() { return field_tax1; }
	public void setField_Tax(int field_tax1) { this.field_tax1 = field_tax1; }
	
	public int getField_Total2() { return field_total21; }
	public void setField_Total2(int field_total21) { this.field_total21 = field_total21; }
	
	public Timestamp getTime() { return time; }
	public void setTime(Timestamp time) { this.time = time; }
	
	

}
