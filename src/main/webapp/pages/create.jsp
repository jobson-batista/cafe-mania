<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../components/navbar.jsp"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles/create.css" />
<link rel="stylesheet" type="text/css" href="styles/navbar.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<title>Cafe Mania - Cadastrar Café</title>
<link rel="icon" type="image/x-icon" href="assets/coffee-cup.ico">
<script type="text/javascript" src="js/utils.js"></script>
<script type="text/javascript" src="js/create.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="toast align-items-center" role="alert"
		aria-live="assertive" aria-atomic="true">
		<div class="d-flex">
			<div class="toast-body"></div>
			<button type="button" class="btn-close me-2 m-auto btn-close-white"
				data-bs-dismiss="toast" aria-label="Close"></button>
		</div>
	</div>
	<div class="container-sm">
		<h2>Cadastrar Café</h2>
		<form name="formCreate" action="register-coffee" method="post">
			<div class="mb-3">
				<label for="name" class="form-label">Nome do Café</label> <input
					name="name" type="text" placeholder="Digite o nome do produto..."
					class="form-control" id="name" aria-describedby="nameHelp">
				<div id="nameHelp" class="form-text">Sugestão: Marca - Tipo -
					Torra - Tamanho</div>
			</div>
			<div class="mb-3">
				<label for="description" class="form-label">Descrição</label>
				<textarea name="description"
					placeholder="Insira uma descrição sobre o café..."
					class="form-control" id="description"></textarea>
			</div>
			<div class="row">
				<div class="mb-3 col">
					<label for="weight" class="form-label">Tamanho do Pacote</label> <select
						name="weight" id="weight" class="form-select"
						aria-label="Selecionar Tamanho do Café. 250g, 500g ou 1kg">
						<option selected>Selecione...</option>
						<option value="250">250 g</option>
						<option value="500">500 g</option>
						<option value="1000">1 kg</option>
					</select>
				</div>
				<div class="mb-3 col">
					<label for="roast" class="form-label">Torra do Grão</label> <select
						name="roast" id="roast" class="form-select"
						aria-label="Selecionar Torra do Café.">
						<option selected>Selecione...</option>
						<option value="LIGHT">Clara</option>
						<option value="MEDIUM">Média</option>
						<option value="DARK">Escura</option>
					</select>
				</div>
				<div class="mb-3 col">
					<label for="type" class="form-label">Tipo</label> <select
						name="type" id="type" class="form-select"
						aria-label="Selecionar Tipo do Café.">
						<option selected>Selecione...</option>
						<option value="ARABICA">Arábica</option>
						<option value="ROBUSTA">Robusta</option>
					</select>
				</div>
				<div class="mb-3 col">
					<label for="price" class="form-label">Preço do Pacote (R$)</label>
					<input name="price" id="price" type="text"
						placeholder="Insira o preço..." class="form-control"
						onkeypress="return isNumberKey(event)">
				</div>
			</div>
			<div class="row container-sm">
				<input type="button" value="Cadastrar" class="btn register-btn col"
					onclick="validate()">
				<button type="submit" class="btn cancel-btn col">Cancelar</button>
			</div>
		</form>
	</div>
</body>
</html>