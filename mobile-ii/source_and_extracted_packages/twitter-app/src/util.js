const util = {}

util.dateDiff = function (a, b) {
  const utc1 = Date.UTC(a.getFullYear(), a.getMonth(), a.getDate(),
    a.getUTCHours(), a.getUTCMinutes(), a.getUTCSeconds())
  const utc2 = Date.UTC(b.getFullYear(), b.getMonth(), b.getDate(),
    b.getUTCHours(), b.getUTCMinutes(), b.getUTCSeconds())

  const day = 24
  const hour = 60
  const minute = 60
  const second = 1000

  let result = (utc2 - utc1) / (second * minute * hour * day)
  let floor = Math.floor(result)

  if (floor > 0) return `${floor} d`

  result *= day
  floor = Math.floor(result)
  if (floor > 0) return `${floor} h`

  result *= hour
  floor = Math.floor(result)
  if (floor > 0) return `${floor} min`

  result *= minute
  floor = Math.floor(result)
  if (floor > 0) return `${floor} sec`
}

export default util
