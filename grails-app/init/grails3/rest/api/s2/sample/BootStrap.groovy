package grails3.rest.api.s2.sample

import rest.s2.sample.auth.Role
import rest.s2.sample.auth.User
import rest.s2.sample.auth.UserRole

class BootStrap {

    def init = { servletContext ->
        def user = new User(username: 'admin', password: 'admin')
        user.save(flush: true)
        def role = new Role(authority: 'ROLE_ADMIN')
        role.save(flush: true)
        new UserRole(user: user, role: role).save(flush: true)
    }
    def destroy = {
    }
}
