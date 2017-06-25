

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'acp.pennapps.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'acp.pennapps.UserRole'
grails.plugin.springsecurity.authority.className = 'acp.pennapps.Role'
grails.plugin.springsecurity.logout.postOnly = false // allows logout to work
datasource {
    hibernate {
        cache.use_second_level_cache=true
        cache.use_query_cache=true
        cache.provider_class='org.hibernate.cache.EhCacheProvider'
    }
}
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
        [pattern : '/dbconsole/**', access : ['ROLE_ADMIN']],
        [pattern : '/plugins/**', access : ['ROLE_USER']],
        [pattern : '/user/**', access :['ROLE_ADMIN']], 
        [pattern : '/role/**', access :['ROLE_ADMIN']],
        [pattern : '/securityInfo/**', access :['ROLE_ADMIN']],
        [pattern : '/registationCode/**', access :['ROLE_ADMIN']]
        
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

