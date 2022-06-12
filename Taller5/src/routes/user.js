/**
 * Renderiza el archivo cool.hbs, encargado de escribir "Eres Genial!"
 * @param {*} req 
 * @param {*} res 
 */

const cool = (req, res) => {
  res.render("cool");
};

/**
 * Se exporta el modulo para otros usos.
 */

module.exports = cool;
