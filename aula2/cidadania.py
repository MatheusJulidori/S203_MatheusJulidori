class Pessoa(object):
    nome = None
    sexo = None
    idade = None

    def __init__(self,nome,sexo,idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade


class Cidadao(Pessoa):
    cpf = None
    def __init__(self,nome,sexo,idade,cpf):
        super().__init__(nome,sexo,idade)
        self.cpf = cpf



nome = input("Entre com o nome: ")
sexo = input("Entre com o sexo: ")
idade = input("Entre com a idade: ")
cpf = input("Entre com o cpf: ")
cidadao_1 = Cidadao(nome,sexo,idade,cpf)
#printando valores:
print(cidadao_1.nome)
print(cidadao_1.sexo)
print(cidadao_1.idade)
print(cidadao_1.cpf)