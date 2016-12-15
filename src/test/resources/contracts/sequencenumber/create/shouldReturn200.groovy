package contracts.sequencenumber.create

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        urlPath('/sequence-numbers')
        body("""
            {
                "type": "BLOCK"
            }
            """)
        headers {
            header('Content-Type': 'application/json') //contentType('application/json')
        }
    }
    response {
        status 200
        body([
            yearMonth: $(execute('isCurrentYearMonth($it)')),
            type: 'BLOCK',
            number: 1
        ])
    }
}