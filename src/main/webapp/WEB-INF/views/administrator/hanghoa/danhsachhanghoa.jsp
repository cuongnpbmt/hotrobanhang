<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<input hidden="" id="msg" value="${msg }"></input>
<!-- Content Header (Page header) -->
<section class="content-header">
	<h1>
		Hàng Hóa
		<%--  <small><a href="${contextPath }/admin/roles?status=active">Danh Sách Hàng Hóa</a></small>
        <small><a class="btn btn-success" href="${contextPath }/admin/hanghoa/add">Thêm mới</a></small> --%>
	</h1>
	<ol class="breadcrumb">
		<a class="btn btn-success" href="${contextPath }/admin/hanghoa/add">Thêm
			mới</a>
		<%-- <li><a href="${contextPath }/"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="${contextPath }/roles">Quyền</a></li>
        <li class="active">Quản lý quyền</li> --%>
	</ol>
</section>

<!-- Main content -->
<section class="content">
	<div class="row">

		<div class="col-xs-12">
			<ul class="nav nav-tabs">
				<li class="tablinks ${param.trangthai == 'active' ? 'active' : '' }">
					<a href="${contextPath }/admin/hanghoa?trangthai=active">Đã
						Kích Hoạt</a>
				</li>

				<li
					class="tablinks ${param.trangthai == 'deleted' ? 'active' : '' }">
					<a href="${contextPath }/admin/hanghoa?trangthai=deleted">Đã
						Xóa</a>
				</li>
			</ul>
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Danh Hàng Hóa</h3>
				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<div class="table-responsive">
						<table id="example2" class="table table-bordered table-hover">
							<thead>
								<tr>
									<th>Mã Hàng</th>
									<th>Tên Hàng</th>
									<th>Giá Nhập</th>
									<th>Giá Bán</th>
									<th>Giá Khuyến Mãi</th>
									<th>Đơn Vị Tính</th>
									
									<th>Thao tác</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="hh" items="${listHanghoa }">
									<tr>
										<td>${hh.mahang }</td>
										<td>${hh.tenhang }</td>
										<td><fmt:formatNumber type="number" pattern="###,###"
												value="${hh.gianhap }" /> &#8363;</td>
										<td><fmt:formatNumber type="number" pattern="###,###"
												value="${hh.giaban }" /> &#8363;</td>
										<td><c:choose>
												<c:when test="${hh.giakhuyenmai == null }">
													Không Khuyến Mãi
												</c:when>
												<c:otherwise>
													<fmt:formatNumber type="number" pattern="###,###"
														value="${hh.giakhuyenmai }" /> &#8363;
												</c:otherwise>
											</c:choose></td>
										<td>${hh.donvitinh }</td>
										

										<td><a href="${contextPath }/admin/hanghoa/${hh.id}">
												<i style="color: blue;" class="fa fa-pencil fa-lg"
												aria-hidden="true" title="Sửa"> </i>
										</a> <c:if test="${hh.trangthai != 'deleted' }">
												<a onclick="deleteOne(${hh.id});" href="#"
													data-toggle="modal" data-target="#myModal"
													style="color: red; margin-left: 10px;"> <i
													class="fa fa-trash-o fa-lg" aria-hidden="true" title="Xóa"></i></a>
											</c:if></td>
									</tr>
								</c:forEach>
							</tbody>
							<tfoot>
								<tr>
									<th>Mã Hàng</th>
									<th>Tên Hàng</th>
									<th>Giá Nhập</th>
									<th>Giá Bán</th>
									<th>Giá Khuyến Mãi</th>
									<th>Đơn Vị Tính</th>
									
									<th>Thao tác</th>
								</tr>
							</tfoot>
						</table>
					</div>
				</div>
				<!-- /.box-body -->
			</div>
			<!-- /.box -->
		</div>
		<!-- /.col -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->



<div class="modal fade" id="myModal" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 style="text-align: center; font-weight: bold; color: red;"
					class="modal-title">Bạn Muốn Xóa ?</h4>
			</div>

			<div class="modal-footer">
				<form:form action="" method="delete">
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
					<input value="" id="arrayId" hidden="" name="arrayId" />
					<button class="btn btn-danger" style="float: left;">Xóa</button>
				</form:form>


				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>

	</div>
</div>