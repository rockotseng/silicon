package contracts.sequencenumber.create

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url('/sequence-numbers')
        body("""
            {
                "type": "BLOCK"
            }
            """)
        headers {
            contentType(applicationJsonUtf8())
        }
    }
    response {
        status 200
        headers {
            contentType(applicationJson())
        }
        body([
            yearMonth: $(client('2016-12'), server(execute('isCurrentYearMonth($it)'))),
            type: 'BLOCK',
            number: 1
        ])
    }
}