<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="keywords" content="opensource, travel, tour, Vietnam" />
<meta name="description" content="Vietnam opensource software group." />
<link rel="canonical" href="http://vn-oss.com/" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="robots" content="All" />
<meta name="robots" content="index,follow" />
<title>Welcome to VietTravel network</title>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="container">
		<div class="start-template">
			<div id="header">
			<div id="logo" class="wp-left-side"></div>
			<div id="#mainNavigation" class="navbar navbar-default wp-right-side">
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">Homepage</a></li>
						<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Region <span class="caret"></span></a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#">North</a></li>
								<li><a href="#">Central</a></li>
								<li><a href="#">South</a></li>
							</ul></li>
						<li><a href="#">Subject</a></li>
						<li><a href="#">Next events</a></li>
						<li><a href="#">Service</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			</div>
			<div style="clear:both;" > </div>
			
			<!-- Slider -->
			 <section id="masthead">
            <div id="mhSlides" class="carousel slide" data-interval="8000">
                <div class="carousel-inner">
                <div id="mhSlide5142" class="item    active" style="background: url('http://www.iacquire.com/wp-content/uploads/2013/04/masthead-offerings.jpg') no-repeat 50% 0 fixed;">
                            <div class="container">
                                <div class="title-group">
                                                                            <h2 class="title"><span class="blue">Become a True Content Brand</span></h2>
                                                                            <p class="sub-title"><span class="blue">Meet The New Digital Agency</span></p>
                                                                    </div>
                                <div class="description">
                                    iAcquire is in the business of content marketing—and, inevitably, so is your brand. We create content that powers your business, and develop strategies that forge the road ahead. Using market research, we ensure your brand’s content aligns with what your users are looking for in search and talking about in social. Welcome to the new way of doing content.                                </div>
                                <div class="video">
                                                                    </div>
                                <div class="button">
                                    <a href="http://www.iacquire.com/offerings/" id="mhButton5142" class="btn btn-alt btn-fancy" >See Our Offerings</a>
                                </div>
                            </div>
                        </div>
                    <div id="mhSlide685" class="item   " style="background: url('http://www.iacquire.com/wp-content/uploads/2013/03/masthead-repair-reputation.jpg') no-repeat 50% 0 fixed;">
                            <div class="container">
                                <div class="title-group">
                                                                            <h2 class="title"><span class="blue">Repairing Reputation, </span></h2>
                                                                            <p class="sub-title"><span class="blue">Boosting Revenue</span></p>
                                                                    </div>
                                <div class="description">
                                    We were approached by a leading internet security company to perform a drastic SEO and reputation management overhaul. We understand that reputation management doesn't exist in a vacuum, and that the nature of search results is connected directly to our clients' bottom line. Take a look at our case study, and see how we changed the search game for our client with a phenomenal ROI.                                </div>
                                <div class="video">
                                                                    </div>
                                <div class="button">
                                    <a href="http://www.iacquire.com/pdf/case-studies/Repairing-Reputations-an-iAcquire-CaseStudy.pdf" id="mhButton685" class="btn btn-alt btn-fancy" >Read More</a>
                                </div>
                            </div>
                        </div>
                                    </div>
                                <a class="carousel-control left" href="#mhSlides" data-slide="prev">&lsaquo;</a>
                <a class="carousel-control right" href="#mhSlides" data-slide="next">&rsaquo;</a>
                            </div>
        </section>
        <!-- /#masthead -->
			
			<h1>Hello, world!</h1>

			<table class="table">
				<tr>
					<th>ID</th>
					<th>name</th>
				</tr>
				<c:forEach var="tour" items="${tours}">
					<tr>
						<td><c:out value="${tour.id}"></c:out>
						<td><c:out value="${tour.name}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>