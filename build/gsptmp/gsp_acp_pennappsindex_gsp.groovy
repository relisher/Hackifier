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
invokeTag('captureHead','sitemesh',163,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',165,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',171,['controller':("user"),'action':("Index")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',172,['controller':("role"),'action':("Search")],2)
printHtmlPart(8)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',173,['controller':("logout"),'action':("Index")],2)
printHtmlPart(11)
invokeTag('message','g',181,['code':("springSecurity.login.header")],-1)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
expressionOut.print(postUrl ?: '/login/authenticate')
printHtmlPart(16)
invokeTag('message','g',189,['code':("springSecurity.login.username.label")],-1)
printHtmlPart(17)
expressionOut.print(usernameParameter ?: 'username')
printHtmlPart(18)
invokeTag('message','g',194,['code':("springSecurity.login.password.label")],-1)
printHtmlPart(19)
expressionOut.print(passwordParameter ?: 'password')
printHtmlPart(20)
expressionOut.print(rememberMeParameter ?: 'remember-me')
printHtmlPart(21)
if(true && (hasCookie)) {
printHtmlPart(22)
}
printHtmlPart(23)
invokeTag('message','g',200,['code':("springSecurity.login.remember.me.label")],-1)
printHtmlPart(24)
expressionOut.print(message(code: 'springSecurity.login.button'))
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',224,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1498408719000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
