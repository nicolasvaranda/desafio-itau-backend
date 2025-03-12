package desafio.itau.springboot.services;

import desafio.itau.springboot.models.Transaction;
import org.springframework.stereotype.Service;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

@Service
public class TransactionService {

    private final Queue<Transaction> transactions = new ConcurrentLinkedDeque<>();
    // TODO
    // addTransaction

}
