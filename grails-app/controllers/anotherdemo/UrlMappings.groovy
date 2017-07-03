package anotherdemo

class UrlMappings {

    static mappings = {
        '/tickets'(resources: 'ticket') {
            collection {
                "/history/${id}"(controller: 'ticket', action:'history', method: 'GET')
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
