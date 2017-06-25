import grails.plugins.metadata.GrailsPlugin
import org.grails.gsp.GroovyPage
import org.grails.web.taglib.*
import org.grails.taglib.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_acp_pennapps_loginauth_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/auth.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',3,['code':("springSecurity.login.title")],-1)
})
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',80,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',85,['code':("springSecurity.login.header")],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
expressionOut.print(postUrl ?: '/login/authenticate')
printHtmlPart(9)
invokeTag('message','g',93,['code':("springSecurity.login.username.label")],-1)
printHtmlPart(10)
expressionOut.print(usernameParameter ?: 'username')
printHtmlPart(11)
invokeTag('message','g',98,['code':("springSecurity.login.password.label")],-1)
printHtmlPart(12)
expressionOut.print(passwordParameter ?: 'password')
printHtmlPart(13)
expressionOut.print(rememberMeParameter ?: 'remember-me')
printHtmlPart(14)
if(true && (hasCookie)) {
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('message','g',104,['code':("springSecurity.login.remember.me.label")],-1)
printHtmlPart(17)
expressionOut.print(message(code: 'springSecurity.login.button'))
printHtmlPart(18)
expressionOut.print(usernameParameter ?: 'username')
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',131,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1498403912000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
