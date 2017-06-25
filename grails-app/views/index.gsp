<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Welcome to Grails</title>
        <asset:stylesheet src="application.css"/>
        <asset:javascript src="application.js"/>
        <style type="text/css" media="screen">

        html {
            /* To make use of full height of page*/
            min-height: 100%;
            margin: 0;
        }



        #login {
                    		margin: 15px 0px;
                    		padding: 0px;
                    		text-align: center;
                    	}

                    	#login .inner {
                                    		width: 400px;
                                    		text-align: left;
                                    		background-color: #f0f0fa;
                                    		-moz-box-shadow: 2px 2px 2px #eee;
                                    		-webkit-box-shadow: 2px 2px 2px #eee;
                                    		-khtml-box-shadow: 2px 2px 2px #eee;
                                    		box-shadow: 2px 2px 2px #eee;
                                    	}

                    	#login .inner .fheader {
                    		padding: 18px 26px 14px 26px;
                    		background-color: #f7f7ff;
                    		margin: 0px 0 14px 0;
                    		color: #2e3741;
                    		font-size: 18px;
                    		font-weight: bold;
                    	}

                    	#login .inner .cssform p {
                    		clear: left;
                    		margin: 0;
                    		padding-left: 105px;
                    		margin-bottom: 20px;
                    		height: 1%;
                    	}

                    	#login .inner .cssform input[type="text"] {
                    		width: 120px;
                    	}

                    	#login .inner .cssform label {
                    		font-weight: bold;
                    		float: left;
                    		text-align: right;
                    		margin-left: -105px;
                    		width: 110px;
                    		padding-right: 10px;
                    	}

                    	#login #remember_me_holder {
                    		padding-left: 120px;
                    	}

                    	#login #submit {
                    		margin-left: 15px;
                    	}

                    	#login #remember_me_holder label {
                    		float: none;
                    		margin-left: 0;
                    		text-align: left;
                    		width: 200px
                    	}

                    	#login .inner .login_message {
                    		color: #c33;
                    	}

                    	#login .inner .text_ {
                    		width: 120px;
                    	}

                    	#login .inner .chk {
                    	}
            #status {
                background-color: #eee;
                border: .2em solid #ccc;
                margin: 2em 2em 1em;
                padding: 1em;
                width: 12em;
                float: left;
                -moz-box-shadow: 0px 0px 1.25em #aaa;
                -webkit-box-shadow: 0px 0px 1.25em #aaa;
                box-shadow: 0px 0px 1.25em #aaa;
                -moz-border-radius: 0.6em;
                -webkit-border-radius: 0.6em;
                border-radius: 0.6em;
            }

            #status ul {
                font-size: 0.9em;
                list-style-type: none;
                margin-bottom: 0.6em;
                padding: 0;
            }

            #status li {
                line-height: 1.3;
            }

            #status h1 {
                font-size: 1.4em;
                margin: 0 0 0.3em;
                color: black;
            }

            #page-body {
                margin: 2em 1em 1.25em 18em;
            }

            h2 {
                margin-top: 1em;
                margin-bottom: 0.3em;
                font-size: 1em;
            }

            p {
                line-height: 1.5;
                margin: 0.25em 0;
            }

            #controller-list ul {
                list-style-position: inside;
            }

            #controller-list li {
                line-height: 1.3;
                list-style-position: inside;
                margin: 0.25em 0;
            }

            @media screen and (max-width: 480px) {
                #status {
                    display: none;
                }

                #page-body {
                    margin: 0 1em 1em;
                }

                #page-body h1 {
                    margin-top: 0;
                }
            }



        </style>
    </head>
    <body>
        <a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div id="status" role="complementary">

            <div id="controller-list" role="navigation">
                <h1><b>Menu</b></h1>
                <ul>
                <li> <g:link controller="user" action="Index">Hacker</g:link></li>
                <li> <g:link controller="role" action="Search"> Admin</g:link></li>
                <li> <g:link controller="logout" action="Index">Logout</g:link></li>
                </ul>
            </div>
        </div>
        <div id="page-body" role="main">
            <h1><b>Welcome to PennApps!</b></h1>
            <div id="login">
            	<div class="inner">
            		<div class="fheader"><g:message code='springSecurity.login.header'/></div>

            		<g:if test='${flash.message}'>
            			<div class="login_message">${flash.message}</div>
            		</g:if>

            		<form action="${postUrl ?: '/login/authenticate'}" method="POST" id="loginForm" class="cssform" autocomplete="off">
            			<p>
            				<label for="username"><g:message code='springSecurity.login.username.label'/>:</label>
            				<input type="text" class="text_" name="${usernameParameter ?: 'username'}" id="username"/>
            			</p>

            			<p>
            				<label for="password"><g:message code='springSecurity.login.password.label'/>:</label>
            				<input type="password" class="text_" name="${passwordParameter ?: 'password'}" id="password"/>
            			</p>

            			<p id="remember_me_holder">
            				<input type="checkbox" class="chk" name="${rememberMeParameter ?: 'remember-me'}" id="remember_me" <g:if test='${hasCookie}'>checked="checked"</g:if>/>
            				<label for="remember_me"><g:message code='springSecurity.login.remember.me.label'/></label>
            			</p>

            			<p>
            				<input type="submit" on_click='window.location.assign("/welcome")' id="submit" value="${message(code: 'springSecurity.login.button')}"/>
            			</p>

                                    <p>

                                    </p>
            		</form>
                        <p id="forgot_pwd_holder">
                            <form action="/register/forgotPassword" >
                            <input type="submit" value="Forgot Password"/>

                            </form>
                        </p>
                                <form action="/register" >
                                    <input type="submit" value="Register Now!" />
                                <form>
            	</div>
            </div>

        </div>
    </body>
</html>

