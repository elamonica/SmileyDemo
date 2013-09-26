<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html> <!--<![endif]-->
    <head>
    
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">

        
        <style>
            body {
                padding-top: 50px;
                padding-bottom: 20px;
            }
        </style>
        <g:javascript library='jquery'/>
		<r:require module="mainCSS" />
		<r:layoutResources/>
        
    </head>
    <body onload="initializeModels()">
        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Smarty</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li class="divider"></li>
                <li class="dropdown-header">Nav header</li>
                <li><a href="#">Separated link</a></li>
                <li><a href="#">One more separated link</a></li>
              </ul>
            </li>
          </ul>
          <g:form class="navbar-form navbar-right" name="emailSignIn" url="[action:'signIn',controller:'indexXXX']">
            <div class="form-group">
              <g:textField name="email" placeholder="Email" value="${email}" class="form-control" />
            </div>
            <div class="form-group">
              <g:textField name="pwd" type="password" placeholder="Password" class="form-control" />
            </div>
            <g:submitButton name="signIn" value="signIn" type="submit" class="btn btn-success">Sign in</g:submitButton>
          
          </g:form>
          
        </div><!--/.navbar-collapse -->
      </div>
    </div>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>Bienvenido a Smarty</h1>
        Un sitio, todo lo que te importa
        
      </div>
    
	<div id="preferences" class="container" style="background-color: white;  border-radius: 15px; padding-bottom: 15px; padding-left: 15px; ">
    	<g:render template="filterForm" />
    </div>
      
		
    </div>


    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-lg-4">
          <h2>Heading</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="#">View details &raquo;</a></p>
        </div>
        <div class="col-lg-4">
          <h2>Heading</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="#">View details &raquo;</a></p>
       </div>
        <div class="col-lg-4">
          <h2>Heading</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <p><a class="btn btn-default" href="#">View details &raquo;</a></p>
        </div>
      </div>

      <hr>

      <footer>
        <p>&copy; Company 2013</p>
      </footer>
    </div> <!-- /container -->        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.1.min.js"><\/script>')</script>

        <script src="js/vendor/bootstrap.js"></script>

        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>

        <script>
            var _gaq=[['_setAccount','UA-XXXXX-X'],['_trackPageview']];
            (function(d,t){var g=d.createElement(t),s=d.getElementsByTagName(t)[0];
            g.src='//www.google-analytics.com/ga.js';
            s.parentNode.insertBefore(g,s)}(document,'script'));
        </script>



		<script>
	function setQuestion(data) {
		// The response comes back as a bunch-o-JSON
		 var $element = $('#carModel');
  		$element.empty();
  		
  		$.each(data, function(index, aData) {
    		var option = $('<option/>').val(aData.id).text(aData.name);
    		$element.append(option)
  		});
  		$element.removeAttr('disabled');
	}
	
	</script>
		<script>
	function updateModels(data) {
		// The response comes back as a bunch-o-JSON
		 var $element = $('#carModel');
  		$element.empty();
  		
  		$.each(data, function(index, aData) {
    		var option = $('<option/>').val(aData.id).text(aData.name);
    		$element.append(option)
  		});
  		$element.removeAttr('disabled');
	}
	
	</script>
	<script>
		function initializeModels()
		{
			// This is called when the page loads to initialize city
			var zselect = document.getElementById('carBrand')
			var zopt = zselect.options[zselect.selectedIndex]
			${remoteFunction(controller:"carBrand", action:"ajaxGetModels", params:"'id=' + zopt.value", onSuccess:"updateModels(data)")}
		}
	</script>


    </body>
</html>