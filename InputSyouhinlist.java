package work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**----------------------------------------------------------------------*
 *■■■InputSurveyクラス■■■
 *概要：サーブレット
 *詳細：HTML文書（回答入力画面）を出力する。
 *----------------------------------------------------------------------**/
public class InputSyouhinlist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InputSyouhinlist() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//レスポンス（出力データ）の文字コードを設定
		response.setContentType("text/html;charset=UTF-8");  //文字コードをUTF-8で設定

		//出力用のストリームの取得
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("user_name");

		//HTML文書（回答入力画面）の出力
		out.println("<html>                                                                   ");
		out.println("<head>                                                                   ");
		out.println("  <title>取り扱い商品一覧</title>                                                ");
		out.println("<script type=\"text/javascript\">");
		out.println("function keisan(){");
		out.println("var tax = 8;");
		out.println("var price1 = document.form1.goods1.selectedIndex * 1800;");
		out.println("document.form1.field1.value = price1;");
		out.println(" var price2 = document.form1.goods2.selectedIndex * 2000; ");
		out.println(" document.form1.field2.value = price2;");
		out.println("var price3 = document.form1.goods3.selectedIndex * 3000;");
		out.println("document.form1.field3.value = price3;");
		out.println(" var total1 = price1 + price2 + price3;");
		out.println("document.form1.field_total1.value = total1;");
		out.println("var tax2 = Math.round((total1 * tax) / 100);");
		out.println(" document.form1.field_tax.value = tax2;");
		out.println("document.form1.field_total2.value = total1 + tax2;");
		out.println("}");
		out.println("</script>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.js\" integrity=\"sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=\" crossorigin=\"anonymous\"></script>");
		out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.quicksearch/2.3.1/jquery.quicksearch.min.js\" integrity=\"sha256-p4O2FDM/VsnStiXmXzKW9svZQjxXFufx7GKCmrHtsRI=\" crossorigin=\"anonymous\"></script>");
		out.println("<script>");
		out.println("(function ($){");
		out.println(" $(document).ready(function(){");
		out.println(" $('#qs').quicksearch('tr.hoge');");
		out.println(" });");
		out.println("})(jQuery.noConflict(true));");
		out.println("</script>");
		out.println("<style type=\"text/css\">");
		out.println("p{font-size: 20px;}");
		out.println("table{");
		out.println("border-collapse: collapse;");
		out.println("border-spacing: 0;");
		out.println("table-layout: fixed;");
		out.println("width: 490px;");
		out.println("}");
		out.println("table tr:last-child{");
		out.println(" border-bottom:solid 1px #ddd;");
		out.println("}");
		out.println("table th{");
		out.println("text-align: center;");
		out.println("padding: 7px 0;");
		out.println(" border-right:solid 1px #ddd;");
		out.println("border-left:solid 1px #ddd;");
		out.println("width: 155px;");
		out.println("}");
		out.println("table th:nth-child(1){");
		out.println("background-color:#dddddd;");
		out.println("}");
		out.println("table th:nth-child(3){");
		out.println(" background-color:#f5b932;");
		out.println("color: white;");
		out.println("}");
		out.println("table tr:nth-child(2) td{");
		out.println(" font-size: 30px;");
		out.println("}");
		out.println("table td{");
		out.println("text-align: center;");
		out.println(" padding: 7px 0;");
		out.println("border-right:solid 1px #ddd;");
		out.println("border-left:solid 1px #ddd;");
		out.println(" width: 155px;");
		out.println("}");
		out.println("table th.target{");
		out.println(" position: relative;");
		out.println("}");
		out.println("table .target{");
		out.println(" width: 180px;");
		out.println("}");
		out.println("table th.target span.no1{");
		out.println("position: absolute;");
		out.println("top: -10px;");
		out.println(" left:calc(50% - 30px);");
		out.println("background: #bdcc28;");
		out.println(" width: 60px;");
		out.println("font-size: 10px;");
		out.println("border-radius: 15px;");
		out.println(" line-height: 1;");
		out.println("padding: 5px;");
		out.println("}");
		out.println("table th.target span.inner{");
		out.println("position: absolute;");
		out.println("color:white;");
		out.println("background-color: #f34955;");
		out.println("left: 0;");
		out.println("bottom: 0;");
		out.println("display: block;");
		out.println(" width: 180px;");
		out.println("padding: 10px 0;");
		out.println("}");
		out.println("");
		out.println("");
		out.println("");
		
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.js\" integrity=\"sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=\" crossorigin=\"anonymous\"></script>");
		out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.quicksearch/2.3.1/jquery.quicksearch.min.js\" integrity=\"sha256-p4O2FDM/VsnStiXmXzKW9svZQjxXFufx7GKCmrHtsRI=\" crossorigin=\"anonymous\"></script>");
		out.println("<script type=\"text/javascript\">(function(a){a(document).ready(function(){a(\"#qs\").quicksearch(\"tr.target\")})})(jQuery.noConflict(!0));</script>");
		out.println("<label>お客様名：<b>" + userName + "</b> </label>");
		out.println("");
		out.println("<p>");
		out.println("絞り込み：<input id=\"qs\" name=\"qs\" type=\"text\"/>");
		out.println("</p>");
		out.println("");
		out.println("");
		out.println("  <form  name=\"form1\" action=\"SaveSyouhinlist\" method=\"post\">                             ");
		out.println("<table border=\"1\">");
		out.println("<tr><th>商品名</th><th>単価</th><th>個数</th><th>合計</th></tr>");
		out.println("<tr class=\"target\"><td>特竹</td><td>1800</td><td><select name=\"goods1\" onChange=\"keisan('field1','field2','field3','field_total1','field_tax','field_total2')\">円");
		out.println("    <option>0</option>                                ");
		out.println("    <option>1</option>                            ");
		out.println("    <option>2</option>                    ");
		out.println("    <option>3</option>                                  ");
		out.println("    <option>4</option>                                  ");
		out.println("    <option>5</option>                                  ");
		out.println("    <option >6</option>                                ");
		out.println("    <option>7</option>                            ");
		out.println("    <option >8</option>                    ");
		out.println("    <option >9</option>                                  ");
		out.println("    <option >10</option>                                  ");
		out.println("    <option>11</option>                                  ");
		out.println("    <option >12</option>                                ");
		out.println("    <option >13</option>                            ");
		out.println("    <option >14</option>                    ");
		out.println("    <option >15</option>                                  ");
		out.println("    <option >16</option>                                  ");
		out.println("    <option >17</option>                                  ");
		out.println("    <option >18</option>                                ");
		out.println("    <option >19</option>                            ");
		out.println("    <option >20</option>                            ");
		out.println("    </select></td>                                                            ");
		out.println("<td><input type=\"text\" name=\"field1\" value=\"\" >円</td> ");
		out.println("</tr>");
		out.println("<tr class=\"target\"><td>赤松</td><td>2000</td><td><select name=\"goods2\" onChange=\"keisan('field2')\">円");
		out.println("    <option>0</option>                                ");
		out.println("    <option>1</option>                            ");
		out.println("    <option>2</option>                    ");
		out.println("    <option>3</option>                                  ");
		out.println("    <option>4</option>                                  ");
		out.println("    <option>5</option>                                  ");
		out.println("    <option >6</option>                                ");
		out.println("    <option>7</option>                            ");
		out.println("    <option >8</option>                    ");
		out.println("    <option >9</option>                                  ");
		out.println("    <option >10</option>                                  ");
		out.println("    <option>11</option>                                  ");
		out.println("    <option >12</option>                                ");
		out.println("    <option >13</option>                            ");
		out.println("    <option >14</option>                    ");
		out.println("    <option >15</option>                                  ");
		out.println("    <option >16</option>                                  ");
		out.println("    <option >17</option>                                  ");
		out.println("    <option >18</option>                                ");
		out.println("    <option >19</option>                            ");
		out.println("    <option >20</option>                            ");
		out.println("    </select></td>                                                            ");
		out.println("<td><input type=\"text\" name=\"field2\" value=\"\" >円</td> ");
		out.println("</tr>");
		out.println("<tr class=\"target\"><td>輝き松</td><td>3000</td><td><select name=\"goods3\" onChange=\"keisan('field3','field_total1','field_tax','field_total2')\">円");
		out.println("    <option>0</option>                                ");
		out.println("    <option>1</option>                            ");
		out.println("    <option>2</option>                    ");
		out.println("    <option>3</option>                                  ");
		out.println("    <option>4</option>                                  ");
		out.println("    <option>5</option>                                  ");
		out.println("    <option >6</option>                                ");
		out.println("    <option>7</option>                            ");
		out.println("    <option >8</option>                    ");
		out.println("    <option >9</option>                                  ");
		out.println("    <option >10</option>                                  ");
		out.println("    <option>11</option>                                  ");
		out.println("    <option >12</option>                                ");
		out.println("    <option >13</option>                            ");
		out.println("    <option >14</option>                    ");
		out.println("    <option >15</option>                                  ");
		out.println("    <option >16</option>                                  ");
		out.println("    <option >17</option>                                  ");
		out.println("    <option >18</option>                                ");
		out.println("    <option >19</option>                            ");
		out.println("    <option >20</option>                            ");
		out.println("    </select></td>                                                            ");
		out.println("<td><input type=\"text\" name=\"field3\" value=\"\" >円</td> ");
		out.println("</tr>");
		out.println("");
		out.println("");
		out.println("");
		out.println("");
		out.println("");
		out.println("");                                                                 
		out.println("  <p></p>                                ");
		out.println("    <p>                                                                  ");
		out.println("    </p>                                                                  ");
		out.println("	  <p>");
		out.println("    		<label>合計</lavel>   ");
		out.println("			<input type=\"text\" name=\"field_total1\"  value=\"\">円 ");
		out.println("	  </p>");
		out.println("	  <p>");
		out.println("			<label>消費税</label>                                            ");
		out.println("			<input type=\"text\" name=\"field_tax\"  value=\"\">円                                           ");
		out.println("	  </p>");
		out.println("	  <p>");
		out.println("			<label>税込み合計</label>                                            ");
		out.println("			<input type=\"text\"  name=\"field_total2\"  value=\"\">円              ");
		out.println("	  </p>");
		out.println("	  <p>");
		out.println("			<input type=\"submit\" value=\"注文\">円");
		out.println("	  </p>");
		out.println("</form>                                                                ");
		out.println("</body>                                                                  ");
		out.println("</html>                                                                  ");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
