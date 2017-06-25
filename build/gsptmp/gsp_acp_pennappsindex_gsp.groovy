import grails.plugins.metadata.GrailsPlugin
import org.grails.gsp.GroovyPage
import org.grails.web.taglib.*
import org.grails.taglib.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_acp_pennappsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',6,['src':("application.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',7,['src':("application.js")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',152,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',154,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
for( c in (grailsApplication.controllerClasses.sort { it.fullName }) ) {
printHtmlPart(7)
createTagBody(3, {->
expressionOut.print(c.name)
})
invokeTag('link','g',161,['controller':(c.logicalPropertyName)],3)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('message','g',170,['code':("springSecurity.login.header")],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
expressionOut.print(postUrl ?: '/login/authenticate')
printHtmlPart(14)
invokeTag('message','g',178,['code':("springSecurity.login.username.label")],-1)
printHtmlPart(15)
expressionOut.print(usernameParameter ?: 'username')
printHtmlPart(16)
invokeTag('message','g',183,['code':("springSecurity.login.password.label")],-1)
printHtmlPart(17)
expressionOut.print(passwordParameter ?: 'password')
printHtmlPart(18)
expressionOut.print(rememberMeParameter ?: 'remember-me')
printHtmlPart(19)
if(true && (hasCookie)) {
printHtmlPart(20)
}
printHtmlPart(21)
invokeTag('message','g',189,['code':("springSecurity.login.remember.me.label")],-1)
printHtmlPart(22)
expressionOut.print(message(code: 'springSecurity.login.button'))
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',213,[:],1)
printHtmlPart(24)
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
