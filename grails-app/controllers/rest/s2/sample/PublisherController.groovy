package rest.s2.sample

import grails.plugin.springsecurity.annotation.Secured
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

@Secured('ROLE_ADMIN')
class PublisherController {

    PublisherService publisherService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond publisherService.list(params), model:[publisherCount: publisherService.count()]
    }

    def show(Long id) {
        respond publisherService.get(id)
    }

    def save(Publisher publisher) {
        if (publisher == null) {
            render status: NOT_FOUND
            return
        }

        try {
            publisherService.save(publisher)
        } catch (ValidationException e) {
            respond publisher.errors, view:'create'
            return
        }

        respond publisher, [status: CREATED, view:"show"]
    }

    def update(Publisher publisher) {
        if (publisher == null) {
            render status: NOT_FOUND
            return
        }

        try {
            publisherService.save(publisher)
        } catch (ValidationException e) {
            respond publisher.errors, view:'edit'
            return
        }

        respond publisher, [status: OK, view:"show"]
    }

    def delete(Long id) {
        if (id == null) {
            render status: NOT_FOUND
            return
        }

        publisherService.delete(id)

        render status: NO_CONTENT
    }
}
