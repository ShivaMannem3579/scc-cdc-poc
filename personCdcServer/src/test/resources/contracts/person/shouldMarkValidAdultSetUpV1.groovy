package contracts

org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'POST'
		url '/check/v1'
		body([
				name: 'vinay',
				age: 21,
				driversLicense: 'abcd'
		])
		headers {
			contentType('application/json')
		}
	}
	response {
		status 200
		body([
				name: 'vinay',
				message : 'ADULT',
				rejectReason: 'NO_REASON'
		])
		headers {
			contentType('application/json')
		}
	}
}
