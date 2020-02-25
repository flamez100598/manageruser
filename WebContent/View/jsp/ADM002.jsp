<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page language="java" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="./View/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/user.js"></script>
<title>ã¦ã¼ã¶ç®¡ç</title>
</head>
<body>
	<!-- Begin vung header -->
	<div>
		<div>
			<table>
				<tr>
					<td width="80%"><img src="../images/logo-manager-user.gif"
						alt="Luvina" />
						<td>
							<td align="left"><a href="ADM001.html">ã­ã°ã¢ã¦ã</a>
								&nbsp; <a href="ADM002.html">ããã</a>
								<td>
				</tr>
			</table>
		</div>
	</div>

	<!-- End vung header -->

	<!-- Begin vung dieu kien tim kiem -->
	<form action="" method="post" name="mainform">
		<table class="tbl_input" border="0" width="90%" cellpadding="0"
			cellspacing="0">
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>
					ä¼å¡åç§°ã§ä¼å¡ãæ¤ç´¢ãã¾ããæ¤ç´¢æ¡ä»¶ç¡ãã®å ´åã¯å¨ã¦è¡¨ç¤ºããã¾ãã
				</td>
			</tr>
			<tr>
				<td width="100%">
					<table class="tbl_input" cellpadding="4" cellspacing="0">
						<tr>
							<td class="lbl_left">æ°å:</td>
							<td align="left"><input class="txBox" type="text"
								name="name" value="" size="20"
								onfocus="this.style.borderColor='#0066ff';"
								onblur="this.style.borderColor='#aaaaaa';" /></td>
							<td></td>
						</tr>
						<tr>
							<td class="lbl_left">ã°ã«ã¼ã:</td>
							<td align="left" width="80px"><select name="group_id">
									<option value="0">å¨ã¦</option>
									<option value="0">NhÃ³m 1</option>
									<option value="0">NhÃ³m 2</option>
							</select></td>
							<td align="left"><input class="btn" type="submit"
								value="æ¤ç´¢" /> <input class="btn" type="button"
								value="æ°è¦è¿½å " /></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<!-- End vung dieu kien tim kiem -->
	</form>
	<!-- Begin vung hien thi danh sach user -->
	<table class="tbl_list" border="1" cellpadding="4" cellspacing="0"
		width="80%">

		<tr class="tr2">
			<th align="center" width="20px">ID</th>
			<th align="left">æ°å <a href="">â²â½</a>
			</th>
			<th align="left">çå¹´ææ¥</th>
			<th align="left">ã°ã«ã¼ã</th>
			<th align="left">ã¡ã¼ã«ã¢ãã¬ã¹</th>
			<th align="left" width="70px">é»è©±çªå·</th>
			<th align="left">æ¥æ¬èªè½å <a href="">â²â½</a>
			</th>
			<th align="left">å¤±å¹æ¥ <a href="">â³â¼</a>
			</th>
			<th align="left">ç¹æ°</th>
		</tr>

		<tr>
			<td align="right"><a href="ADM005.html">1</a></td>
			<td>Nguyá»n Thá» Mai HÆ°Æ¡ng</td>
			<td align="center">1983/07/08</td>
			<td>PhÃ²ng QAT</td>
			<td>ntmhuong@luvina.net</td>
			<td>0914326386</td>
			<td>TrÃ¬nh Äá» tiáº¿ng nháº­t cáº¥p 4</td>
			<td align="center">2011/07/08</td>
			<td align="right">290</td>
		</tr>
		<tr>
			<td align="right"><a href="ADM005.html">2</a></td>
			<td>LÃª Thá» Xoa</td>
			<td align="center">1983/07/08</td>
			<td>PhÃ²ng DEV1</td>
			<td>xoalt@luvina.net</td>
			<td>1234567894</td>
			<td>TrÃ¬nh Äá» tiáº¿ng nháº­t cáº¥p 4</td>
			<td align="center">2011/07/08</td>
			<td align="right">290</td>
		</tr>
		<tr>
			<td align="right"><a href="ADM005.html">3</a></td>
			<td>Äáº·ng Thá» HÃ¢n</td>
			<td align="center">1983/07/08</td>
			<td>PhÃ²ng DEV1</td>
			<td>handt@luvina.net</td>
			<td>1234567894</td>
			<td>TrÃ¬nh Äá» tiáº¿ng nháº­t cáº¥p 4</td>
			<td align="center">2011/07/08</td>
			<td align="right">290</td>
		</tr>
		<tr>
			<td align="right"><a href="ADM005.html">4</a></td>
			<td>LÃª NghiÃªm Thá»§y</td>
			<td align="center">1983/07/08</td>
			<td>PhÃ²ng DEV1</td>
			<td>thuyln@luvina.net</td>
			<td>1234567894</td>
			<td>TrÃ¬nh Äá» tiáº¿ng nháº­t cáº¥p 4</td>
			<td align="center">2011/07/08</td>
			<td align="right">290</td>
		</tr>
		<tr>
			<td align="right"><a href="ADM005.html">5</a></td>
			<td>LÃª PhÆ°Æ¡ng Anh</td>
			<td align="center">1983/07/08</td>
			<td>PhÃ²ng QAT</td>
			<td>anhlp@luvina.net</td>
			<td>1234567894</td>
			<td>TrÃ¬nh Äá» tiáº¿ng nháº­t cáº¥p 4</td>
			<td align="center">2011/07/08</td>
			<td align="right">290</td>
		</tr>

	</table>
	<!-- End vung hien thi danh sach user -->

	<!-- Begin vung paging -->
	<table>
		<tr>
			<td class="lbl_paging"><a href="#">1</a> &nbsp;<a href="#">2</a>
				&nbsp;<a href="#">3</a>&nbsp;<a href="#">>></a></td>
		</tr>
	</table>
	<!-- End vung paging -->

	<!-- Begin vung footer -->
	<div class="lbl_footer">
		<br><br><br><br> Copyright
						Â©ã2010ãã«ããã½ããã¦ã¨ã¢æ ªå¼ä¼ç¤¾. All rights
						reserved. 
	</div>
	<!-- End vung footer -->

</body>

</html>