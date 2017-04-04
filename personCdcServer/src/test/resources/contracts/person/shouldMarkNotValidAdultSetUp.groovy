package contracts.person

org.springframework.cloud.contract.spec.Contract.make {
	request { 
		method 'POST'
		url '/check'
		body([ 
			   name: 'vinay',
			   age: 15
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
				rejectReason: 'AGE IS LESS THAN 18'
		])
		headers {
			contentType('application/json')
		}
	}
}
