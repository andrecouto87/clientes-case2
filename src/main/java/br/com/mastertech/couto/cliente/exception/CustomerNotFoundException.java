package br.com.mastertech.couto.cliente.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cliente não encontrado")
public class CustomerNotFoundException extends RuntimeException {
}
