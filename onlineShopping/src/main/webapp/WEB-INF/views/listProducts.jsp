<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<div class="row">
		<!-- for displaying sidebar -->
		<div class="colListProduct md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<!-- displaying the actual products -->
		<div class="col md-9">
			<!-- adding breadCrump component -->
			<div class="row">
				<div class="my-4 lg-12">
					<nav aria-label="breadcrumb">
						<c:if test="${userClickAllProducts== true }">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
								<li class="breadcrumb-item active" aria-current="page">All
									Products</li>
							</ol>	
						</c:if>
					</nav>
					<nav aria-label="breadcrumb">
						<c:if test="${userClickCategoryProducts== true }">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
								<li class="breadcrumb-item active" aria-current="page">${category.name}</li>
							</ol>
						</c:if>
					</nav>
				</div>

			</div>
		</div>

	</div>
</div>