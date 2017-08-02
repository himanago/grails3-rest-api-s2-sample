

// Added by the Spring Security Core plugin:
//grails.plugin.springsecurity.userLookup.userDomainClassName = 'rest.s2.sample.auth.User'
//grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'rest.s2.sample.auth.UserRole'
//grails.plugin.springsecurity.authority.className = 'rest.s2.sample.auth.Role'
//grails.plugin.springsecurity.controllerAnnotations.staticRules = [
//		'/':                              ['permitAll'],
//		'/index':                         ['permitAll'],
//		'/index.gsp':                     ['permitAll'],
//		'/assets/**':                     ['permitAll'],
//		'/**/js/**':                      ['permitAll'],
//		'/**/css/**':                     ['permitAll'],
//		'/**/images/**':                  ['permitAll'],
//		'/**/favicon.ico':                ['permitAll']
//]
//
//
//grails.plugin.springsecurity.rest.login.active  = true
//grails.plugin.springsecurity.rest.login.endpointUrl = '/api/login'
//grails.plugin.springsecurity.rest.login.failureStatusCode = '401'
//
//grails.plugin.springsecurity.rest.login.useJsonCredentials  = true
//grails.plugin.springsecurity.rest.login.usernamePropertyName =  'username'
//grails.plugin.springsecurity.rest.login.passwordPropertyName =  'password'
//
//grails.plugin.springsecurity.rest.logout.endpointUrl = '/api/logout'
//
//grails.plugin.springsecurity.rest.token.generation.useSecureRandom  = true
//grails.plugin.springsecurity.rest.token.generation.useUUID  = false
//
//grails.plugin.springsecurity.rest.token.storage.useGorm = false
//grails.plugin.springsecurity.rest.token.storage.gorm.tokenDomainClassName   = null
//grails.plugin.springsecurity.rest.token.storage.gorm.tokenValuePropertyName = 'tokenValue'
//grails.plugin.springsecurity.rest.token.storage.gorm.usernamePropertyName   = 'username'
//
//grails.plugin.springsecurity.rest.token.rendering.usernamePropertyName  = 'username'
//grails.plugin.springsecurity.rest.token.rendering.authoritiesPropertyName   = 'roles'
//
//grails.plugin.springsecurity.rest.token.validation.active   = true
//grails.plugin.springsecurity.rest.token.validation.headerName   = 'X-Auth-Token'
//grails.plugin.springsecurity.rest.token.validation.endpointUrl  = '/api/validate'
//
////Exclude normal controllers from basic auth filter. Just the JSON API is included
//grails.plugin.springsecurity.filterChain.chainMap = [
//	//Stateless chain
//	[
//		pattern: '/api/**',
//		filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'
//	],
//
//	//Traditional chain
//	[
//		pattern: '/**',
//		filters: 'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter'
//	]
//]