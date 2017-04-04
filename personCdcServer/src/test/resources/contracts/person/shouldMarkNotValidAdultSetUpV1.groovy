package contracts

org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'POST'
		url '/check/v1'
		body([
				name: 'vinay',
				age: 21
		])
		headers {
			contentType('application/json')
		}
	}
	response {
		status 200
		body([
				name: 'vinay',
				message : 'NOT AN ADULT',
				rejectReason: 'DRIVERS LICENSE IS NOT VALID'
		])
		headers {
			contentType('application/json')
		}
	}
}
