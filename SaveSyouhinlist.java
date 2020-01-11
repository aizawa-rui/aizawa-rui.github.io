package work;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**----------------------------------------------------------------------*
 *■■■SaveSurveyクラス■■■
 *概要：サーブレット
 *詳細：リクエスト（アンケートデータ）を「survey」テーブルに登録し、画面遷移する。
 *　　　＜遷移先＞登録成功：回答完了画面（finish.html）／登録失敗：エラー画面（error.html）
 *----------------------------------------------------------------------**/
public class SaveSyouhinlist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveSyouhinlist() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//レスポンス（出力データ）の文字コードを設定
		response.setContentType("text/html;charset=UTF-8");     //文字コードをUTF-8で設定
		//リクエスト（受信データ）の文字コードを設定
		request.setCharacterEncoding("UTF-8");                  //文字コードをUTF-8で設定


		//リクエストパラメータを取得
		
		int   goods11 = Integer.parseInt(request.getParameter("goods1")) ; 
		int   field11 = Integer.parseInt(request.getParameter("field1"));
		int   goods21 =Integer.parseInt( request.getParameter("goods2"));
		int   field21=  Integer.parseInt(request.getParameter("field2")) ;  
		int   goods31 = Integer.parseInt( request.getParameter("goods3"));                //リクエストパラメータ（SEX）
		int   field31=Integer.parseInt( request.getParameter("field3"));
		int   field_total11 = Integer.parseInt( request.getParameter("field_total1"));
		int   field_tax1    = Integer.parseInt( request.getParameter("field_tax")) ;
		int   field_total21 =Integer.parseInt( request.getParameter("field_total2"));
		

		//アンケートデータ（SurveyDto型）の作成
		SyouhinlistDto dto = new SyouhinlistDto();
		
		dto.setGoods1(goods11);
		dto.setField1(field11);
		dto.setGoods2(goods21);
		dto.setField2(field21);
		dto.setGoods3(goods31);
		dto.setField3(field31);
		dto.setField_Total1(field_total11);
		dto.setField_Tax(field_tax1);
		dto.setField_Total2(field_total21);
		dto.setTime( new Timestamp(System.currentTimeMillis()) ); 
		  //現在時刻を更新時刻として設定


		//アンケートデータをDBに登録
		BusinesssLogic logic = new BusinesssLogic();
		boolean succesInsert = logic.executeInsertSyouhinlist(dto);  //DB操作成功フラグ（true:成功/false:失敗）


		//DB操作の成功/失敗に応じて表示させる画面を振り分ける
		if (succesInsert) {

			//DB登録に成功した場合、回答完了画面（finish.html）を表示する
			response.sendRedirect("htmls/finish.html");
			

		} else {

			//DB登録に失敗した場合、エラー画面（error.html）を表示する
			response.sendRedirect("htmls/error.html");

		}
	}
}
